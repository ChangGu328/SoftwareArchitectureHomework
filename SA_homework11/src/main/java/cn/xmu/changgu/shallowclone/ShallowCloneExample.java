package cn.xmu.changgu.shallowclone;

public class ShallowCloneExample implements Cloneable {
    private int data;
    private Integer[] dataArray;

    public ShallowCloneExample(int data, Integer[] dataArray) {
        this.data = data;
        this.dataArray = dataArray;
    }

    @Override
    public ShallowCloneExample clone() {
        try {
            return (ShallowCloneExample) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public static void main(String[] args) {
        Integer[] dataArray = {1, 2, 3};
        ShallowCloneExample original = new ShallowCloneExample(100, dataArray);
        ShallowCloneExample cloned = original.clone();

        cloned.dataArray[0] = 1000;  // 修改克隆对象的数组元素

        System.out.println("Original array first element: " + original.dataArray[0]);
        // 输出：Original array first element: 1000
    }
}

