


public static ArrayList<Post> readJsonString(String json)throws Exception {
        ArrayList<Post> postList = new ArrayList<>();

        boolean wasUrl = false;
        boolean wasTitle = false;
        Post post;
        String title = "";
        int count = 50;
        String json; //gets from network

        JsonReader reader = new JsonReader(new StringReader(json));
        while(count > 0){
        String name = "default name";
        String string = "defauld string";

        JsonToken nextToken = reader.peek();
        System.out.println(nextToken);

        if(JsonToken.BEGIN_OBJECT.equals(nextToken)){
        reader.beginObject();
        System.out.println("Begin Object");
        }else if(JsonToken.NAME.equals(nextToken)){
        name = reader.nextName();
        if(name.equals("url")){
        wasUrl = true;
        }
        System.out.println(name);
        }else if(JsonToken.STRING.equals(nextToken)){
        string = reader.nextString();
        if(wasUrl&&string.length()<35&&string.length()>20&&string.contains("http")){
        if(!(string.contains(".png")||string.contains(".jpg"))){
        string += ".png";
        }

        post = new Post(""+count+" "+string.length(), string);
        postList.add(post);
        wasUrl = false;
        count--;
        }else if(wasTitle){
        title = string+" "+count;
        }
        System.out.println("-" + string);
        }else if(JsonToken.END_DOCUMENT.equals(nextToken)){
        break;
        }else if(JsonToken.BEGIN_ARRAY.equals(nextToken)){
        reader.beginArray();
        System.out.println("Begin Array");
        }else if(JsonToken.END_OBJECT.equals(nextToken)){
        reader.endObject();
        System.out.println("End Object"+count);
        }else if(JsonToken.END_ARRAY.equals(nextToken)){
        reader.endArray();
        }else{
        reader.skipValue();
        System.out.println("skip");
        }

        }//while
        return postList;
        }