package com.example.demo;

import com.example.demo.charSheet.CharSheet;
import com.example.demo.charSheet.CharSheetRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("charSheets")
public class DemoApplication {
	private final CharSheetRepository charSheetRepository;

	public DemoApplication(CharSheetRepository charSheetRepository) {
		this.charSheetRepository = charSheetRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
	public List<CharSheet> getCharSheets() {
		return charSheetRepository.findAll();
	}
}
