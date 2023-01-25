package pp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {
	private boolean verifyUrl(String url) {
        if (!url.startsWith("http://")
                && !url.startsWith("https://")) {
            return false;
        }
        return true;
    }

	@Test
	void testID() {
		SearchCrawler sc=new SearchCrawler();
		
		// 1st test
//		sc.addMatch("http://www.example.com");
//		assertEquals("http://www.example.com", sc.table.getModel().getValueAt(0, 0));
		
		// 2nd test
//		sc.updateStats("crawling", 10, 20, 50);
//		assertEquals("crawling", sc.crawlingLabel2.getText());
//		assertEquals("10", sc.crawledLabel2.getText());
//		assertEquals("20", sc.toCrawlLabel2.getText());
//		assertEquals(50, sc.progressBar.getMaximum());
//		assertEquals(10, sc.progressBar.getValue());
//		assertEquals("0", sc.matchesLabel2.getText());
		
		// 3rd test
//		assertTrue(verifyUrl("http://www.example.com"));
//		assertFalse(verifyUrl("www.example.com"));
		
		// 4th test
//		String pageContents = "This is a test page";
//		String searchString = "test page";
//		
//		boolean caseSensitive = false;
//		boolean expectedResult = true;
//		
//		boolean result = sc.searchStringMatches(pageContents, searchString, caseSensitive);
//		assertEquals(expectedResult, result);
	}
}
