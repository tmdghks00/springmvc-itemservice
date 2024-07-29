package hello.itemservice.domain.item;

import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ItemRepository {

    private static final Map<Long, Item> store = new HashMap<>(); //static 사용
    private static long sequence = 0L; //static 사용

    public Item save(Item item) { // Item 을 저장하는 기능
        item.setId(++sequence);
        store.put(item.getId(), item);
        return item;
    }

    public Item findById(Long id) { // Item 1개 조회하는 기능
        return store.get(id);
    }

    public List<Item> findAll() { // Item 전체 조회하는 기능
        return new ArrayList<>(store.values());
    }

    public void update(Long itemId, Item updateParam) {
        Item findItem = findById(itemId);
        findItem.setItemName(updateParam.getItemName());
        findItem.setPrice(updateParam.getPrice());
        findItem.setQuantity(updateParam.getQuantity());
    }

    public void clearStore() { // 테스트에서 쓸려고 만듬
        store.clear(); // store 에 있는 해시맵 데이터 다 날라감
    }
}