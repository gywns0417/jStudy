package Base;

public class ObjectMember {
    public String id;

    public ObjectMember(String id){
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof ObjectMember target){
            if(id.equals(target.id)) {
                return true;
        }
    }
    return false;
    }
}
