import {Link} from "react-router-dom";
import './Header.css'

export default function Header() {
    return (
        <>
            <ul>
                <li><Link to={"/"}>Main</Link></li>
                <li><Link to={"/characters"}>Characters</Link></li>
            </ul>
        </>
    )
}