import './Navbar.css'

type data = {
    id: number,
    heading: string,
    img: string,
    description: string
}
type dataProps = {
    entries: data[]
}
export default function Navbar({entries}: dataProps) {

    return (
        <ul>
            {entries.map(entry => <li key={entry.id}>{entry.heading}</li>)}

        </ul>
    )
}