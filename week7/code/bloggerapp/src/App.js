import { useState } from "react";
import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";
import CourseDetails from "./CourseDetails";

function App() {
  const [view,setView]=useState({book:false,blog:false,course:false});

  const handleCheckbox = (event) => {
    const { name, checked } = event.target;
    setView(prev => ({
      ...prev,
      [name]: checked
    }));
  };

  return (
    <div >
      Book Details
      <input type="checkbox" name="book" checked={view.book} onChange={handleCheckbox} /><br />
      {view.book && <BookDetails />}<br />
      Blog Details
      <input type="checkbox" name="blog" checked={view.blog} onChange={handleCheckbox} /><br />
      {view.blog && <BlogDetails />}<br />
      Course Details
      <input type="checkbox" name="course" checked={view.course} onChange={handleCheckbox} /><br />
      {view.course && <CourseDetails />}<br />
      
    </div>
  );
}

export default App;
