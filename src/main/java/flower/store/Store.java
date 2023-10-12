package flower.store;

import java.util.ArrayList;
import java.util.List;

import flower.filters.SearchFilter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Store {
    private List<Item> items;

    public List<Item> search(SearchFilter filter) {
        List<Item> foundItems = new ArrayList<>(null);
        for(Item item: items){
            if (filter.match(item)) {
                foundItems.add(item);
            }
        }
        return foundItems;
    }
}
