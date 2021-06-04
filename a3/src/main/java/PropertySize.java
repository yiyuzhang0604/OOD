/**
 * enum for the property size
 */
public enum PropertySize {
    SMALL{
        @Override
        public String toString(){
            return "Small";
        }
    },
    MEDIUM{
        @Override
        public String toString(){
            return "Medium";
        }
    },
    Large{
        @Override
        public String toString(){
            return "Large";
        }
    }
}
