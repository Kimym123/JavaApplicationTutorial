package se.hs.ac.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import se.hs.ac.dto.Category;

import java.util.List;

@RequiredArgsConstructor
@Getter
public class SizeItemsResponse<T> {
        private final int size;
        private final List<T> items;
}
