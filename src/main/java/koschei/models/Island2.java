package koschei.models;

public class Island2 { // бин данного класса вызывается в кофиге через класс getIsland

    private final Wood3 wood;

    public Island2(Wood3 wood) {
        this.wood = wood;
    }

    @Override
    public String toString() {
        return ", на острове дерево " + wood.toString();
    }
}
