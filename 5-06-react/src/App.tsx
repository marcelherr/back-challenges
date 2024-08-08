import './App.css'

import Header from "./components/Header/Header.tsx";
import Blog from "./components/Blog/Blog.tsx";
import Navbar from "./components/Navbar/Navbar.tsx";


export default function App() {

    const entries: data[] = [
        {
            id: 1,
            heading: "Little Gret Cat",
            img: "https://wallup.net/wp-content/uploads/2018/10/06/708149-kittens-kitten-cat-cats-baby-cute-s.jpg",
            description: "The little grey sweet cat is absolute cute and melts my heart"
        },
        {
            id: 2,
            heading: "Fluffy White Cat",
            img: "https://i.pinimg.com/originals/03/3d/a0/033da021ca8172bd32039e82c14c6c55.jpg",
            description: "A fluffy white cat with striking blue eyes, perfect for cuddling."
        },
        {
            id: 3,
            heading: "Playful Orange Tabby",
            img: "https://i2.pickpik.com/photos/439/61/291/kitten-red-mackerel-tabby-cat-baby-cat-preview.jpg",
            description: "This playful orange tabby loves to chase after toys and bask in the sun."
        },
        {
            id: 4,
            heading: "Mischievous Black Cat",
            img: "https://www.warrenphotographic.co.uk/photography/bigs/46905-Playful-black-kitten-white-background.jpg",
            description: "A mischievous black cat with a love for exploring every nook and cranny."
        },
        {
            id: 5,
            heading: "Sleepy Calico Cat",
            img: "https://png.pngtree.com/background/20230516/original/pngtree-calico-cat-sleeping-in-the-nature-picture-image_2604156.jpg",
            description: "A sleepy calico cat who spends most of her day napping in cozy spots."
        },
        {
            id: 6,
            heading: "Curious Siamese Kitten",
            img: "https://www.thesprucepets.com/thmb/IDPAinGhb_7yAO9ZQDmCaDdK1A0=/2700x1907/filters:fill(auto,1)/young-cat--kitten-of-siam--oriental-breed--bobtail-mekong--lies-on-bed-955264812-5c8bf43cc9e77c0001a92647.jpg",
            description: "This curious Siamese kitten has an inquisitive nature and a love for adventure."
        }
    ]

    type data = {
        id: number,
        heading: string,
        img: string,
        description: string
    }

    return (
        <div>
            <Header/>
            <section>
                <div className="navbar">
                    <Navbar entries={entries}/>
                </div>
                <Blog entries={entries}/>
            </section>
        </div>)
}

