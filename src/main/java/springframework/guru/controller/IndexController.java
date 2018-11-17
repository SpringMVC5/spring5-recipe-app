package springframework.guru.controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import springframework.guru.domain.Category;
import springframework.guru.domain.UnitOfMeasure;
import springframework.guru.repositories.CategoryRepository;
import springframework.guru.repositories.UnitOfMeasureRepository;

@Controller
public class IndexController {
	
	private CategoryRepository categoryRepository;
	private UnitOfMeasureRepository  unitOfMeasureRepository;
	
	public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
		this.categoryRepository = categoryRepository;
		this.unitOfMeasureRepository = unitOfMeasureRepository;
	}



	@RequestMapping({"", "/","index"})
	public String getIndexPage() {
		
		Optional<Category> categoryDescription = categoryRepository.findByDescription("American");
		Optional<UnitOfMeasure> unitOfMeasureDescription = unitOfMeasureRepository.findByDescription("Teaspoon");
		
		System.out.println("Cat id is: " + categoryDescription.get().getId());
		System.out.println("UOM id is: " + unitOfMeasureDescription.get().getId());
		
		System.out.println("Testing dev Tools");
		return "index";
	}

}
