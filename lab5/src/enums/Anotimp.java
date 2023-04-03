package enums;

public enum Anotimp {
    VARA("foarte cald"){
        @Override
        public void temperatura() {
            System.out.println("35-40");
        }
    },
    IARNA("foarte frig") {
        @Override
        public void temperatura() {
            System.out.println("-10-1");
        }
    },
    PRIMAVARA("caldut") {
        @Override
        public void temperatura() {
            System.out.println("10-20");
        }
    },
    TOAMNA("caldut") {
        @Override
        public void temperatura() {
            System.out.println("20-30");
        }
    };

    private String carecteristica;

    Anotimp(String carecteristica) {
        this.carecteristica = carecteristica;
    }

    public String getCarecteristica() {
        return carecteristica;
    }

    public abstract void temperatura();
}
