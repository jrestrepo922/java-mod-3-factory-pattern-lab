public class CameraFactory {
    public enum CameraManufacturer{
        CANON,
        NIKON,
    }

    public static Camera createCamera(CameraManufacturer cameraManufacturer){
        if(cameraManufacturer == CameraManufacturer.CANON){
            return new CanonCamera();
        } else if(cameraManufacturer == CameraManufacturer.NIKON){
            return new NikonCamera();
        }
        return null;
    }
}
