import './Blog.css'
import Card from "../Card/Card.tsx";

type Data = {
    id: number,
    heading: string,
    img: string,
    description: string
}
type DataProps = {
    entries: Data[]
}


export default function Blog({entries}: DataProps) {
    return (<div>
            {entries.map(entry => <Card key={entry.id} heading={entry.heading} img={entry.img}
                                        description={entry.description}/>)
            }
        </div>
    )
}