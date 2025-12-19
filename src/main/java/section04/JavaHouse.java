package section04;

public class JavaHouse {

    private String address;

    private LivingRoom livingRoom;

    public JavaHouse(String address) {
        this.address = address;
        this.livingRoom = new LivingRoom(100);
    }

    public LivingRoom getLivingRoom() {
        return livingRoom;
    }



    public static class LivingRoom{

        private double area;

        public LivingRoom(double area){
            this.area = area;
        }

    }

}
