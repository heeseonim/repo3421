public class CircleDrawer {

    class Point {
        int x, y;
    }

    void circle_draw(Point p, double radius) {
        //원을 화면에 그린다.
    }

    void circleDelete(Point p, double radius) {
        //원을 화면에 지운다.
    }

    void drawOutlinedCircle(boolean isOutline, Point p, double radius) {
        if(p.x == 0 && p.y == 0)
            firstDraw(radius);

        if(!isOutline)
            return;

        circle_draw2(p, radius);
    }

    void drawUnOutLinedCircle(boolean isOutline, Point p, double radius) {
        if(p.x == 0 && p.y == 0)
            firstDraw(radius);

        if(isOutline)
            return;

        circle_draw(p, radius);
    }

    void deleteCircle(Point p, double radius) {
        if(p.x == 0 && p.y == 0)
            firstDraw(radius);

        circleDelete(p, radius);
    }

    void drawCircle(boolean isDraw, boolean isOutline, Point p, double radius) {
        if (isDraw) {
            drawOutlinedCircle(isOutline, p, radius);
            drawUnOutLinedCircle(isOutline, p, radius);
        } else {
            deleteCircle(p, radius);
        }
    }

    void circle_draw2(Point p, double radius) {
        //테두리가 있는 원을 화면에 그린다.
    }

    void firstDraw(double radius) {
        //0, 0 에 그림을 그리지 못하도록 예외처리
        //에러 출력 하지 않고, 아무것도 하지 않는다.
    }
}