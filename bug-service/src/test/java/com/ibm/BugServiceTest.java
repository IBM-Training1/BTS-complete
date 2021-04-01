package com.ibm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BugServiceTest {

	@Test
	void testCreateBug() {
		BugService bugService = new BugService();
		BugRepository dummyRepo = new DummyBugRepository();
		bugService.setBugRepository(dummyRepo);
		Bug bug = new Bug();
		String bugId = bugService.createBug(bug);
		assertNotNull(bugId);
	}

	/*/@Test
	void testGetBugById() {
		fail("Not yet implemented");
	}

	@Test
	void testGetBugs() {
		fail("Not yet implemented");
	}

	@Test
	void testUpdateBug() {
		fail("Not yet implemented");
	}
/*/
}
