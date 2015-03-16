package web.security.analyzer;


public class ContinuosAggregation {
	
	public static void main(String[] args) {
		GitHubProjectServletEBJFinder finder = new GitHubProjectServletEBJFinder();
		Aggregator aggregator = new Aggregator();
		
		int iterations = 0;
		int max_iterations = 155; //about 64 hours (each iteration takes around 25 minutes, thus (64*60)/25
		while (iterations < max_iterations) {
		
			finder.getProjects("<web-resource-collection>", "xml", finder.getServlet_links(), "WEB-INF");
			finder.getProjects("<security-identity>", "xml", finder.getEjb_links(), "");
			finder.findMatches();
			finder.save(finder.getMatch_links(), "./servlet_ejb_links.txt");
			
			aggregator.aggregate("./aggr_servlet_ejb_links.txt", "./servlet_ejb_links.txt");
		
			iterations++;
		}
	}

}
