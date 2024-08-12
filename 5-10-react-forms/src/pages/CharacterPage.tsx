import CharacterGallery from "../components/CharacterGallery/CharacterGallery.tsx";


export default function CharacterPage({filteredCharacters, setSearchText}: any) {

    return (
        <>
            <h2>Welcome to the Character Page</h2>

            <input type="text" onChange={(e) => setSearchText(e.target.value)} placeholder="Search for a character"/>
            {
                filteredCharacters.length > 0
                    ? <CharacterGallery characters={filteredCharacters}/>
                    : <p>No characters found</p>
            }</>)
}