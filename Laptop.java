public class Laptop {
    private String brand;
    private String model;
    private int resolution;
    private int frequency;
    private int coresAmmount;
    private String driveType;
    private int driveSize;
    private int RAM;
    private int videoMemory;
    private int price;

    public Laptop(String brand, String model, int resolution, int frequency, int coresNum, String driveType,
            int driveSize, int rAM, int videoMem, int price) {
        this.brand = brand;
        this.model = model;
        this.resolution = resolution;
        this.frequency = frequency;
        this.coresAmmount = coresNum;
        this.driveType = driveType;
        this.driveSize = driveSize;
        RAM = rAM;
        this.videoMemory = videoMem;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getResolution() {
        return resolution;
    }

    public int getFrequency() {
        return frequency;
    }

    public int getCoresAmmount() {
        return coresAmmount;
    }

    public String getDriveType() {
        return driveType;
    }

    public int getDriveSize() {
        return driveSize;
    }

    public void setDriveSize(int driveSize) {
        this.driveSize = driveSize;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int rAM) {
        RAM = rAM;
    }

    public int getVideoMemory() {
        return videoMemory;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop [brand=" + brand + ", model=" + model + ", resolution=" + resolution + ", frequency=" + frequency
                + ", coresNum=" + coresAmmount + ", driveType=" + driveType + ", driveSize=" + driveSize + ", RAM=" + RAM
                + ", videoMem=" + videoMemory + ", price=" + price + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((brand == null) ? 0 : brand.hashCode());
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + resolution;
        result = prime * result + frequency;
        result = prime * result + coresAmmount;
        result = prime * result + ((driveType == null) ? 0 : driveType.hashCode());
        result = prime * result + driveSize;
        result = prime * result + RAM;
        result = prime * result + videoMemory;
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (brand == null) {
            if (other.brand != null)
                return false;
        } else if (!brand.equals(other.brand))
            return false;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (resolution != other.resolution)
            return false;
        if (frequency != other.frequency)
            return false;
        if (coresAmmount != other.coresAmmount)
            return false;
        if (driveType == null) {
            if (other.driveType != null)
                return false;
        } else if (!driveType.equals(other.driveType))
            return false;
        if (driveSize != other.driveSize)
            return false;
        if (RAM != other.RAM)
            return false;
        if (videoMemory != other.videoMemory)
            return false;
        if (price != other.price)
            return false;
        return true;
    }
}
