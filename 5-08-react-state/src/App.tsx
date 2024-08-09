import {CharacterType} from "./types/Types.ts";
import './App.css'
import {response} from "./data/apiResponse.tsx";
import Card from "./components/Card/Card.tsx";
import {ChangeEvent, useState} from "react";


export default function App() {

    const [state, setState] = useState<CharacterType[]>(response);

    function handleSearch(event: ChangeEvent<HTMLInputElement>) {
        const inputValue = event.target.value;
        setState(response.filter(item => item.name.toLowerCase().includes(inputValue.toLowerCase())))
    }

    return (
        <>
            <h1>Rick & Morty Gallery</h1>
            <input
                onChange={handleSearch}
                placeholder={"Name"}
            />
            <ul>
                {
                    state.map((entry: CharacterType) => <Card key={entry.id} entry={entry}/>)
                }
            </ul>
        </>
    )
}

