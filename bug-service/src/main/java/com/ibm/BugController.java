package com.ibm;

import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BugController {
	@Autowired
	BugService bugService;


	/**
	 * validation
	 * 
	 * @param bindingResult
	 */
	private void validateModel(Errors bindingResult) {
		if (bindingResult.hasErrors()) {
			throw new IllegalArgumentException("something went wrong, please try again");
		}
	}

	/**
	 * method to create bug
	 * 
	 * @param bug
	 * @param bindingResult
	 * @return the id
	 */

	@PostMapping("/bug")
	String createBug(@RequestBody @Valid Bug bug, BindingResult bindingResult) {
		validateModel(bindingResult);
		System.out.println(bug);
		return bugService.createBug(bug);
	}
	private void validateModel(Errors bindingResult) {
		if (bindingResult.hasErrors()) {
			throw new IllegalArgumentException("something went wrong, please try again");
		}
	}

	/**
	 * method to search bugId
	 * 
	 * @param bugId
	 * @return zero or matchingId
	 */
	@GetMapping("/bug/{id}")
	Optional<Bug> getBugById(@PathVariable("id") String bugId) {
		return bugService.getBugById(bugId);
	}

	@GetMapping("/bug")
	List<Bug> getBugs() {
		return bugService.getBugs();
	}

	/**
	 * updates the changes in Bug
	 * 
	 * @param bugId
	 * @param bug
	 * @param bindingResult
	 */
	@PutMapping("/bug/{id}")
	void updateBug(@RequestBody @Valid Bug bug, @PathVariable("id") String bugId, BindingResult bindingResult) {
		validateModel(bindingResult);
		System.out.println(bugId);
		bug.setId(bugId);
		bugService.updateBug(bug);
	}
}
