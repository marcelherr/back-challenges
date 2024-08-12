import {useState} from "react";

export default function CharacterForm() {

    const [user, setUser] = useState({id: "", name: "", species: "", status: ""})

    function addCharacter(event) {
        event.preventDefault();
        console.log("addCharacter")
    }

    return (
        <>
            <h3>Add Character</h3>
            <form onSubmit={() => addCharacter}>
                <label>
                    <input placeholder={"Id"}/>
                </label>
                <label>
                    <input placeholder={"name"}/>
                </label>
                <label>
                    <input placeholder={"species"}/>
                </label>
                <label>
                    <input placeholder={"status"}/>
                </label>
                <button>Submit</button>
            </form>
        </>
    )
}