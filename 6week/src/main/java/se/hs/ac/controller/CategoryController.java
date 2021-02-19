package se.hs.ac.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.hs.ac.dto.Category;
import se.hs.ac.response.SizeItemsResponse;
import se.hs.ac.service.CategoryService;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping("categories")
    public SizeItemsResponse<Category> getCategory() {
        return categoryService.getCategory();
    }
}
