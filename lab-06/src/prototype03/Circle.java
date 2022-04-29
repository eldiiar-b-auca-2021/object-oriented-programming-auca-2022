package prototype03;

public class Circle extends Figure{
        private int r;
        public Circle(int x, int y, int r){
            if (r < 0){
                throw new IllegalArgumentException("Circle: radius < 0: "+r);
            }
            this.x = x;
            this.y = y;
            this.r = r;

        }

        public boolean contains(int xClick, int yClick) {
            int dx = xClick - x;
            int dy = yClick - y;
            return r * r >= dx * dx + dy * dy;
        }
        public String toString() {
            return String.format("Circle: %d %d %d%n", x, y, r);
        }

    }
