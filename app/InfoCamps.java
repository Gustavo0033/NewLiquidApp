public class InfoCamps {

    private int id;
    private int imageCamp;
    private int Color;

    public InfoCamps(int id, int imageCamp, int color) {
        this.id = id;
        this.imageCamp = imageCamp;
        Color = color;
    }

    public int getId() {
        return id;
    }

    public int getColor() {
        return Color;
    }

    public int getImageCamp() {
        return imageCamp;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setColor(int color) {
        Color = color;
    }

    public void setImageCamp(int imageCamp) {
        this.imageCamp = imageCamp;
    }
}
