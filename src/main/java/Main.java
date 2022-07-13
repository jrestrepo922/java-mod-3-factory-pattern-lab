public class Main {
    public static void main(String[] args) {
        Camera camera = CameraFactory.createCamera(CameraFactory.CameraManufacturer.CANON);
        Photographer photographer = new Photographer(camera);
        photographer.takePhotograph();
        System.out.println(photographer.getCamera().cameraType());
    }
}
