public class CanonCamera implements Camera{
    private String brand;

    public CanonCamera() {
        this.brand = "Canon";
    }

    @Override
    public void takePhotograph() {
        System.out.println("Engage the film mechanism to prepare to roll the film for the next exposure");
        System.out.println("Roll the film for the exposure to come");
        System.out.println("Release the film mechanism");
        System.out.println("Open (flip up) the mirror to redirect the light towards the film (instead of the viewfinder)");
        System.out.println("Open the shutter (set shutter speed, initialize shutter, activate shutter, release shutter)");
        System.out.println("Close (flip down) the mirror to direct the incoming light from the lens back to the viewfinder again");
        System.out.println("Congratulations, you have taken a picture with your Canon Camera");
    }

    @Override
    public String cameraType() {
        return this.brand;
    }
}
