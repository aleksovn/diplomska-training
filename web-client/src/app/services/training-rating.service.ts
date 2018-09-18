import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable()
export class TrainingRatingService {
    private trainingRequestUrl = 'http://localhost:8080/trainingRating';

    constructor(private http: HttpClient) { }

    getAllTrainingRatings(): Observable<Object> {
        return this.http.get(`${this.trainingRequestUrl}/all`);
    }
}
