import './App.css'

import {Route, Routes} from "react-router-dom";
import MainPage from "./pages/MainPage.tsx";
import CharacterPage from "./pages/CharacterPage.tsx";
import Header from "./components/Header/Header.tsx";
import {useState} from "react";
import {characters} from "./Characters.ts";
import CharacterDetailPage from "./components/CharcaterDetailPage/CharacterDetailPage.tsx";

export default function App() {

    const [searchText, setSearchText] = useState("");

    const filteredCharacters = characters
        .filter((character) => character.name.toLowerCase().includes(searchText.toLowerCase()));


    return (
        <>
            <h1>Rick and Morty Gallery</h1>
            <Header/>
            <Routes>
                <Route path={"/"} element={<MainPage/>}/>
                <Route path={"/characters"} element={<CharacterPage setSearchText={setSearchText}
                                                                    filteredCharacters={filteredCharacters}/>}/>
                <Route path={"/characters/:id"}
                       element={<CharacterDetailPage/>}/>
            </Routes>
        </>
    );
}
