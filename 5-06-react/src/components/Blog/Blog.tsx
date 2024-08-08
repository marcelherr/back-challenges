import './Blog.css'
import Card from "../Card/Card.tsx";

type data = {
    id?: number,
    heading: string,
    img: string,
    description: string
}
type dataProps = {
    entries: data[]
}


export default function Blog({entries}: dataProps) {
    return (<div>
            {entries.map(entry => <Card key={entry.id} heading={entry.heading} img={entry.img}
                                        description={entry.description}/>)
            }
        </div>
    )
}