import {ResponseType} from "../../types/Types.ts";
import './Card.css'


export default function Card({entry}: ResponseType) {
    console.log(entry)


    return (
        <li className="cardList">
            <h2>{entry.name}</h2>
            <p>{entry.status}</p>
            <img src={entry.image} className="cardImage"/>
        </li>

    )
}