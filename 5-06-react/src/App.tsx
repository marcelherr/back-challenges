import './App.css'

import Header from "./components/Header/Header.tsx";
import Blog from "./components/Blog/Blog.tsx";
import Navbar from "./components/Navbar/Navbar.tsx";

export default function App() {


    return (
        <div>
            <Header/>
            <section>
                <div className="navbar">
                    <Navbar/>
                </div>
                <Blog/>

            </section>
        </div>)
}

