public class Photographer {

    private Camera camera;

    public Photographer(Camera camera) {
        this.camera = camera;
    }

    public void takePhotograph(){
       camera.takePhotograph();
    }

    public Camera getCamera() {
        return camera;
    }
}
