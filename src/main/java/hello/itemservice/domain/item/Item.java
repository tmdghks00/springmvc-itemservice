package hello.itemservice.domain.item;

import lombok.Data;
// @Data = @Getter @Setter 등 모두 적용되지만 사용하기 위험함 주의해야함
// => @Data 는 DTO 같을때만 쓰면 좋고 이럴때는 좋지 않음
// 이럴때는 @Getter @Setter 직접 입력하는것이 좋음
@Data
public class Item {

    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}