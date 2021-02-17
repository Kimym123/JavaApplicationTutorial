package se.hs.ac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.hs.ac.dao.CategoryDao;
import se.hs.ac.dto.Category;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {

    private final CategoryDao categoryDao;

    @Autowired
    public CategoryService(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    public List<Category> getCategory() {
        List<Category> list = categoryDao.selectCategoryList();
        return list;
    }

    public int getCategoryCount() {
        return categoryDao.selectCategoryList().size();
    }

//    public Map showCategory_Map() {
//        Map map = new HashMap();
//        map.put("size", getCategoryCount());
//        map.put("items", getCategoryList());
//        return map;
//    }

    public List showCategory_List(){
        List list = new ArrayList();
        list.add("size:"+getCategoryCount());
        list.add("items:");
        // @@@@@@@@@@@@@@@@@@@ 제네릭을 사용하고 싶은데 이 녀석은 어떻게 처리해야할지 모르겠다...
        list.add(getCategory());
        return list;
    }


}
