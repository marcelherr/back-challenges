import './Card.css'

type DataPropType = {
    id?: number,
    heading: string,
    img: string,
    description: string
}

export default function Card({heading, img, description}: DataPropType) {

    return (
        <article>
            <h2>{heading}</h2>
            < img
                src={img}
                width="400" alt={heading}/>
            <p>{description}</p>
        </article>
    )
}