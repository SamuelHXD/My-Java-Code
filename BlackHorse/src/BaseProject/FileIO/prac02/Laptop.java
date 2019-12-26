package BaseProject.FileIO.prac02;

public class Laptop {
    public void open(){
        System.out.println("笔记本开机!");
    }

    public void useUsb(USB usb){
        if (usb != null){
            usb.open();
            if (usb instanceof Mouse){
                Mouse m = (Mouse) usb;
                m.click();
            }else if (usb instanceof KeyBoard){
                KeyBoard kb = (KeyBoard)usb;
                kb.type();
            }
            usb.close();
        }
    }

    public void close(){
        System.out.println("笔记本关机!");
    }
}
