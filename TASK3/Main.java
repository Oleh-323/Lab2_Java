public class Main {
    public static void main(String[] args) {

        Storage storage = new Storage();

        storage.addGoods(new Goods("tovar1", 4, 2, 3));
        storage.addGoods(new Goods("tovar2", 5, 2, 4));
        storage.addGoods(new Goods("tovar3", 6, 3, 5));//error 3
        storage.addGoods(new Goods("tovar4", 2, 1, 4));
        storage.addGoods(new Goods("tovar5", 1, 3, 3));
        storage.addGoods(new Goods("tovar6", 3, 6, 1));//error 6
        storage.displayArray();
        storage.reciverGoods();
        storage.allStorageArray();
    }
}
