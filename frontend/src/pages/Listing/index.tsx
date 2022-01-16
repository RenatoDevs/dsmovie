import Pagination from "components/Pagination";
import MovieCard from "components/MovieCard";
import axios from "axios";
import {useEffect, useState} from "react";
import { BASE_URL } from "util/request";
import { MoviePage} from "types/movie";

function Listing() {


  const  [pageNumber, setPageNumber] = useState(0);

  /*Hook useEffect*/
  useEffect(() => {
    axios.get(`${BASE_URL}/movies?size=12%page=0`)
      .then(response => {
        console.log(response.data);
        const data = response.data as MoviePage;
        setPageNumber(data.number);
      });
  },[]);
  

  //FORMA ERRADA  
  

  return (
    <>
      <p>0</p>
      <Pagination />

      <div className="container">
        <div className="row">
          <div className="col-sm-6 col-lg-4 col-xl-3 mb-3">
            <MovieCard />
          </div>
          <div className="col-sm-6 col-lg-4 col-xl-3 mb-3">
            <MovieCard />
          </div>
          <div className="col-sm-6 col-lg-4 col-xl-3 mb-3">
            <MovieCard />
          </div>
          <div className="col-sm-6 col-lg-4 col-xl-3 mb-3">
            <MovieCard />
          </div>
          <div className="col-sm-6 col-lg-4 col-xl-3 mb-3">
            <MovieCard />
          </div>
          <div className="col-sm-6 col-lg-4 col-xl-3 mb-3">
            <MovieCard />
          </div>
          <div className="col-sm-6 col-lg-4 col-xl-3 mb-3">
            <MovieCard />
          </div>
        </div>
      </div>
    </>
  );
}

export default Listing;
