/**
 * Lab7_4
 */
interface EventListener{
    public void perfromEvent();
 }

interface MouseListener extends EventListener{
        public void mouseClicked();
        public void mousePressed();
        public void mouseReleased();
        public void mouseMoved();
        public void mouseDragged();
}

interface KeyListener extends EventListener{
    public void keyPressed();
    public void keyReleased();

}

class EventDemo implements MouseListener, KeyListener{
    public void perfromEvent(){
        System.out.println("Event started performing");
    }
    public void mouseClicked(){
        System.out.println("Mouse Clicked");
    }
    public void mousePressed(){
        System.out.println("Mouse Pressed");
    }
    public void mouseReleased(){
        System.out.println("Mouse Released");
    }
    public void mouseMoved(){
        System.out.println("Mouse Moved");
    }
    public void mouseDragged(){
        System.out.println("Mouse Dragged");
    }
    public void keyPressed(){
        System.out.println("Key Pressed");
    }
    public void keyReleased(){
        System.out.println("Key Released");
    }

}
public class Lab7_4 {
    public static void main(String[] args) {
        EventDemo ed = new EventDemo();
        ed.perfromEvent();
        ed.mouseClicked();
        ed.mousePressed();
        ed.mouseReleased();
        ed.mouseMoved();
        ed.mouseDragged();
        ed.keyPressed();
        ed.keyReleased();
        
    }
    
}
