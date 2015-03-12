package web.security.analyzer;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;


public class GitHubProjectDownloader {
	
	private static final int BUFFER_SIZE = 4096;
	private final String SAMPLE_FILE_PATH = "./sample_projects.txt";
	private final String TARGET_WORKSPACE = "C:\\Users\\atlanmod\\Desktop\\runtime-EclipseXtext\\";
	
	public void downloadRepoZip(String repoUrl, String zipFilePath) {
        try {
            URL url = new URL(repoUrl);
            URLConnection conn = url.openConnection();
            InputStream in = conn.getInputStream();
            FileOutputStream out = new FileOutputStream(zipFilePath);
            byte[] b = new byte[1024];
            int count;
            while ((count = in.read(b)) >= 0) {
                out.write(b, 0, count);
            }
            out.flush(); out.close(); in.close();                   
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	public void unzipRepo(String zipFilePath, String destDirectory) {
		try {
	        File destDir = new File(destDirectory);
	        if (!destDir.exists()) {
	            destDir.mkdir();
	        }
	        ZipInputStream zipIn = new ZipInputStream(new FileInputStream(zipFilePath));
	        ZipEntry entry = zipIn.getNextEntry();
	        // iterates over entries in the zip file
	        while (entry != null) {
	            String filePath = destDirectory + File.separator + entry.getName();
	            if (!entry.isDirectory()) {
	                // if the entry is a file, extracts it
	                extractFile(zipIn, filePath);
	            } else {
	                // if the entry is a directory, make the directory
	                File dir = new File(filePath);
	                dir.mkdir();
	            }
	            zipIn.closeEntry();
	            entry = zipIn.getNextEntry();
	        }
	        zipIn.close();
		}
	    catch (Exception e) { System.out.println(zipFilePath + " unzip problem!"); }
    }
	
	private void extractFile(ZipInputStream zipIn, String filePath) {
		try {
	        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath));
	        byte[] bytesIn = new byte[BUFFER_SIZE];
	        int read = 0;
	        while ((read = zipIn.read(bytesIn)) != -1) {
	            bos.write(bytesIn, 0, read);
	        }
	        bos.close();
		}
		catch (Exception e) { System.out.println(filePath + " not converted!"); }
    }
	
	public void deleteRepoZip(String path) {
		try {
			File toDelete = new File(path);
			toDelete.delete();
		}
		catch (Exception e) { System.out.println(path + " not deleted!"); }
	}
	
	public void importSampleToWorkspace() {
		try {
			FileReader reader = new FileReader(this.SAMPLE_FILE_PATH);
			BufferedReader br = new BufferedReader(reader);
			
			int counter = 0;
			String currentLine;
			String currentRepo;
			while ((currentLine = br.readLine()) != null) {
				currentRepo = String.valueOf(counter) + "_repo.zip";
				this.downloadRepoZip(currentLine, "./tmp/" + currentRepo);
				this.unzipRepo("./tmp/" + currentRepo, this.TARGET_WORKSPACE);
				this.deleteRepoZip("./tmp/" + currentRepo);
				counter++;
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	public static void main(String[] args) {
		GitHubProjectDownloader sa = new GitHubProjectDownloader();
		sa.importSampleToWorkspace();
	}
	

}
