/**
 * 
 */
package in.thirumal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Thirumal
 *
 */
@RestController
@RequestMapping()
public class EtagExample {

	@GetMapping()
	public String getName() {
		return "Thirumal";
	}
}
