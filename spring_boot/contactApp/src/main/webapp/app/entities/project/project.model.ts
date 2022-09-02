import { IContact } from 'app/entities/contact/contact.model';

export interface IProject {
  id?: number;
  name?: string | null;
  duration?: string | null;
  status?: boolean | null;
  contacts?: IContact[] | null;
}

export class Project implements IProject {
  constructor(
    public id?: number,
    public name?: string | null,
    public duration?: string | null,
    public status?: boolean | null,
    public contacts?: IContact[] | null
  ) {
    this.status = this.status ?? false;
  }
}

export function getProjectIdentifier(project: IProject): number | undefined {
  return project.id;
}
