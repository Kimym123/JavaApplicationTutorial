package se.hs.ac.service;

import se.hs.ac.dao.CategoryDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import se.hs.ac.dto.Category;
import se.hs.ac.response.SizeItemsResponse;

@RequiredArgsConstructor
@Service
public class CategoryService {
    private final CategoryDao categoryDao;

    public SizeItemsResponse<Category> getCategory() {
        return new SizeItemsResponse(categoryDao.selectCategoryList().size(), categoryDao.selectCategoryList());
    }
}
