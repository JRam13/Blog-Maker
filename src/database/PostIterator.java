package database;

import java.util.ArrayList;
import java.util.Iterator;
import posts.Post;

//============================================================
//Iterator class. This makes it a lot easier to manipulate
//and modify posts in our local database
//============================================================

@SuppressWarnings("rawtypes")
public class PostIterator implements Iterator{
	private int index;
	ArrayList<Post> postList;
	
	public PostIterator(ArrayList<Post> newPostList){
		index = 0;
		postList = newPostList;
	}

	@Override
	public boolean hasNext() {
		if(index  < postList.size()){
			return true;
		}
		return false;
	}

	@Override
	public Post next() {
		// TODO Auto-generated method stub
		return (Post) postList.get(index++);
	}

	@Override
	public void remove() {
		postList.remove(index);
	}

	public ArrayList<Post> add(Post post) {
		postList.add(0, post);
		return postList;
	}

}
