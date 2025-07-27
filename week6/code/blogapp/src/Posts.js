import React from 'react';
import Post from './Post';

class Posts extends React.Component{
    constructor(props){
        super(props);
        this.state={
            posts: [],
        };
    }
    loadPosts(){
        fetch('https://jsonplaceholder.typicode.com/posts')
        .then(res=>res.json())
        .then(data=>{
            const x=data.map(y => new Post(y.id,y.title,y.body));
            this.setState({posts:x});
        });
    }
    componentDidMount(){
        this.loadPosts();
    }
    componentDidCatch(error,info){
        console.error("error",error,info);
    }
    render(){
        return (
            <div>
                <h1>Blog Posts</h1>
                {this.state.posts.map(post =>(
                    <div key={post.id}>
                        <h2>{post.title}</h2>
                        <p>{post.body}</p>
                        <hr />
                    </div>
                ))}
            </div>
        );
    }
}

export default Posts;