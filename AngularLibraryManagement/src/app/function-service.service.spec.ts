import { TestBed } from '@angular/core/testing';

import { FunctionServiceService } from './function-service.service';

describe('FunctionServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: FunctionServiceService = TestBed.get(FunctionServiceService);
    expect(service).toBeTruthy();
  });
});
