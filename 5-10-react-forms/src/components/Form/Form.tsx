import {ChangeEvent, FormEvent, useState} from "react";

export default function CharacterForm() {

    type Character = {
        name: string,
        species: string,
        status: string,
        id: string
    }

    const [character, setCharacter] = useState<Character>({id: "", name: "", species: "", status: ""})

    const onChange = (event: ChangeEvent<HTMLInputElement>) => {
        setCharacter({...character, [event.target.name]: event.target.value})
    }


    function addCharacter(event: FormEvent<HTMLFormElement>) {
        event.preventDefault();
        console.log("addCharacter", character)
    }

    return (
        <>
            <h3>Add Character</h3>
            <form onSubmit={addCharacter}>
                <label>ID:
                    <input value={character.id} name="id" onChange={onChange} placeholder={"Id"}/>
                </label>
                <label>Name:
                    <input value={character.name} name="name" onChange={onChange} placeholder={"name"}/>
                </label>
                <label>Species
                    <input value={character.species} name="species" onChange={onChange} placeholder={"species"}/>
                </label>
                <label>Status
                    <input value={character.status} name="status" onChange={onChange} placeholder={"status"}/>
                </label>
                <button type={"submit"}>Submit</button>
            </form>
        </>
    )
}