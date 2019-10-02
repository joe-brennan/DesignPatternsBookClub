package Composite;

class Waitress {
    private MenuComponent allMenus;

    Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    void printMenu() {
        allMenus.print();
    }
}
