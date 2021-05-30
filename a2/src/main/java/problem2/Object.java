package problem2;

/**
 * Object class which has basic attributes such as width, height and depth;
 */
public class Object {
    private Integer width;
    private Integer height;
    private Integer depth;

    /**
     * Construct an Object class object
     * @param width - width
     * @param height -height
     * @param depth - depth
     */
    public Object(Integer width, Integer height, Integer depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    /**
     * @return width
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * @return height
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * @return depth
     */
    public Integer getDepth() {
        return depth;
    }
}
